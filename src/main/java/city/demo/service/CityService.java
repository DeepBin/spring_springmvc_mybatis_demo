
    /**  
    * @Title: CityService.java
    * @Package city.demo.service
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author wjk
    * @date 2018��5��13��
    * @version V1.0  
    */
    
package city.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import city.demo.model.City;

/**
    * @ClassName: CityService
    * @Description: TODO(������һ�仰��������������)
    * @author wjk
    * @date 2018��5��13��
    *
    */
@Service
public interface CityService {

	
	    /**
	    * @Title: getCityList
	    * @Description: TODO(������һ�仰�����������������)
	    * @param @return    ����
	    * @return List<City>    ��������
	    * @throws
	    */
	    
	List<City> getCityList();

}
