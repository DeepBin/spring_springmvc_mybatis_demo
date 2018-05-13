
    /**  
    * @Title: CityServiceImp.java
    * @Package city.demo.service.serviceImp
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月13日
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
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author wjk
    * @date 2018年5月13日
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
