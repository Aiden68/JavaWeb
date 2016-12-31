package gz.itcast.contactSys_web.service.impl;

import gz.itcast.contactSys_web.dao.ContactDao;
import gz.itcast.contactSys_web.dao.impl.ContactDaoMySQLImpl;
import gz.itcast.contactSys_web.entity.Contact;
import gz.itcast.contactSys_web.exception.NameRepeatException;
import gz.itcast.contactSys_web.service.ContactService;

import java.util.List;
/**
 * ҵ���߼���
 * ������Ŀ�г��ֵ�ҵ���߼�
 * @author APPle
 *
 */
public class ContactServiceImpl implements ContactService {
	//ContactDao dao = new ContactDaoImpl();
	ContactDao dao = new ContactDaoMySQLImpl();
	
	public void addContact(Contact contact) throws NameRepeatException {
		//ִ��ҵ���߼��ж�
		if(dao.checkContact(contact.getName())){
			//�ظ�
			/**
			 * ע�⣺ ���ҵ��㷽�������κ�ҵ���쳣���򷵻ر�ǣ��Զ����쳣����servlet
			 */
			throw new NameRepeatException("�����ظ�������ʹ��");
		}
		//������ظ�����ִ����ӷ���
		dao.addContact(contact);
	}

	public void deleteContact(String id) {
		dao.deleteContact(id);
	}

	public List<Contact> findAll() {
		return dao.findAll();
	}

	public Contact findById(String id) {
		return dao.findById(id);
	}

	public void updateContact(Contact contact) {
		dao.updateContact(contact);
	}

}
