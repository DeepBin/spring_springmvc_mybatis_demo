
    /**  
    * @Title: CityServiceImp.java
    * @Package city.demo.service.serviceImp
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author wjk
    * @date 2018��5��13��
    * @version V1.0  
    */
    
package city.demo.service.serviceImp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import city.demo.dao.CityDao;
import city.demo.model.City;
import city.demo.service.CityService;

/**
    * @ClassName: CityServiceImp
    * @Description: TODO(������һ�仰��������������)
    * @author wjk
    * @date 2018��5��13��
    *
    */
@Service
public class CityServiceImp implements CityService{
	@Resource
  private  CityDao cityDao;
  public  List<City> getCityList(){
	  return  cityDao.selelctList();
  }
}
