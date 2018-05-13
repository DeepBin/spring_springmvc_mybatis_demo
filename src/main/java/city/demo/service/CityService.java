
    /**  
    * @Title: CityService.java
    * @Package city.demo.service
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月13日
    * @version V1.0  
    */
    
package city.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import city.demo.model.City;

/**
    * @ClassName: CityService
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author wjk
    * @date 2018年5月13日
    *
    */
@Service
public interface CityService {

	
	    /**
	    * @Title: getCityList
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return List<City>    返回类型
	    * @throws
	    */
	    
	List<City> getCityList();

}
