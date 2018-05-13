
    /**  
    * @Title: CityDaoTest.java
    * @Package city
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月13日
    * @version V1.0  
    */
    
package city;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import city.demo.dao.CityDao;
import city.demo.model.City;

/**
    * @ClassName: CityDaoTest
    * @Description: CityDao 单元测试类
    * @author wjk
    * @date 2018年5月13日
    *
    */

public class CityDaoTest extends BaseTest {
	@Autowired 
	private CityDao cityDao;
	/**
	 * 
	    * @Title: insert
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void insert() {
		City city  = new City();
		city.setCityCode("450521");
		city.setCityName("合浦县1");
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
		city.setCityName("保山");
		city.setCityCode("533001");
		int i = cityDao.updateByPrimaryKey(city);
		System.out.println(i+"行受影响");
	}
	@Test
	public void deleteById() {
		Integer  id  = 1;
		int i = cityDao.deleteByPrimaryKey(id);
	}
}
