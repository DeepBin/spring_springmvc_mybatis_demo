
    /**  
    * @Title: CityDaoTest.java
    * @Package city
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author wjk
    * @date 2018��5��13��
    * @version V1.0  
    */
    
package city;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import city.demo.dao.CityDao;
import city.demo.model.City;

/**
    * @ClassName: CityDaoTest
    * @Description: CityDao ��Ԫ������
    * @author wjk
    * @date 2018��5��13��
    *
    */

public class CityDaoTest extends BaseTest {
	@Autowired 
	private CityDao cityDao;
	/**
	 * 
	    * @Title: insert
	    * @Description: TODO(������һ�仰�����������������)
	    * @param     ����
	    * @return void    ��������
	    * @throws
	 */
	@Test
	public void insert() {
		City city  = new City();
		city.setCityCode("450521");
		city.setCityName("������1");
		cityDao.insert(city);
	}
	
	@Test
	public void getCityById() {
		Integer id = 3;
		City city = cityDao.selectByPrimaryKey(id);
		System.out.println(city.toString());
	}
	
	@Test
	public  void updateById() {
		City city  = new City();
		city.setId(3);
		city.setCityName("��ɽ");
		city.setCityCode("533001");
		int i = cityDao.updateByPrimaryKey(city);
		System.out.println(i+"����Ӱ��");
	}
	@Test
	public void deleteById() {
		Integer  id  = 1;
		int i = cityDao.deleteByPrimaryKey(id);
	}
}
