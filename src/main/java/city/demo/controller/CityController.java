
    /**  
    * @Title: CityController.java
    * @Package com.example.demo.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月10日
    * @version V1.0  
    */
    
package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityService;

/**
    * @ClassName: CityController
    * @Description: CityController
    * @author wjk
    * @date 2018年5月10日
    *
    */
@RequestMapping("/city")
@RestController
public class CityController {
	@Resource 
	private  CityService cityService;
	/**
	 * 
	    * @Title: insertValus
	    * @Description: 插入数据
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	    * @author wjk
	 */
	@PostMapping("/insertValues")
	public void insertValus(@RequestBody City city) {
		cityService.insertValues(city);
	}
	
	/**
	 * 
	    * @Title: listCity
	    * @Description: 查询所有的记录
	    * @param @return    参数
	    * @return List<City>    返回类型
	    * @throws
	    * @author wjk
	 */
	@GetMapping("/list")
	public List<City> listCity() {
		return  cityService.listCity();
	}
	
	/**
	 * 
	    * @Title: selectByPrimaryKey
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return City    返回类型
	    * @throws
	 */
	@GetMapping("getCityById")
	public City selectByPrimaryKey() {
		return  cityService.selectByPrimaryKey(1);
	}
	
	/**
	 * 
	    * @Title: getCityById
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return City    返回类型
	    * @throws
	 */
	@GetMapping("/{id}")
	public City getCityById(@PathVariable int id) {

		return  cityService.selectByPrimaryKey(id);
	}
	
	/**
	 * 	
	    * @Title: updateOne
	    * @Description: 
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@PutMapping("/{id}")
	public String updateOne(@PathVariable int id,@RequestBody City city) {
		//业务逻辑
		return  null;
	}
	
	@DeleteMapping("/{id}")
	public String deleteOne(@PathVariable int id,HttpServletRequest request,@RequestParam(value = "delete_reason",required = false) String deleteReason) {
		//业务逻辑
		return null;
	}
}
