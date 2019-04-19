package kr.co.noel.javadoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * Descriptions.First Sentence : 해당 Class에 대한 설명을 기입합니다.
 * 
 * <ul>
 * <li>클래스 부가 설명 리스트_1
 * <li>클래스 부가 설명 리스트_2
 * <li>클래스 부가 설명 리스트_3
 *     (관련링크 : <a href="#">관련링크버튼</a>)
 * </ul>
 * 
 * <p>
 * HTML P태그를 이용한 설명 기입_1
 * <p>
 * HTML P태그를 이용한 설명 기입_2
 * <p>
 * HTML P태그를 이용한 설명 기입_3
 *  
 * @author 작성자_1
 * @author 작성자_2
 * @version "%G%"  버전
 * @since 작성일
 */
@RestController
@RequestMapping(value = "/rest")
public class RestControllerTest {

	/** 
     * Descriptions.First Sentence : 해당 Method에 대한 설명을 기입합니다.
     * 
     * <p>
     * HTML P태그를 이용한 설명 기입_1
     * <p>
     * HTML P태그를 이용한 설명 기입_2
     * <p>
     * HTML P태그를 이용한 설명 기입_3
     *
     * @param path_1 : 해당 메소드의 파라미터 path_1에 대한 설명을 기입합니다.
     * @param path_2 : 해당 메소드의 파라미터 path_2에 대한 설명을 기입합니다.
     * @param path_3 : 해당 메소드의 파라미터 path_3에 대한 설명을 기입합니다.
     * @param queryString_1 : 해당 메소드의 파라미터 queryString_1에 대한 설명을 기입합니다.
     * @param queryString_2 : 해당 메소드의 파라미터 queryString_2에 대한 설명을 기입합니다.
     * @param queryString_3 : 해당 메소드의 파라미터 queryString_3에 대한 설명을 기입합니다.
     * @return          <code>리턴타입_1</code> 해당 Method 수행 성공<br> 
     *                  <code>리턴타입_2</code> 해당 Method 수행 시 예외 발생
     * @since 해당 Method 작성일을 기입합니다.
     * @deprecated 더 이상 사용되지 않는 메소드임을 명시한 후, 대체 메소드를 link합니다. <br> {@link #restControllerTest_2(String,String,String,String,String,String)} <br>
     * @exception NullPointerException : 해당 Method 수행 시 발생 가능한 NullPointerException에 대한 설명을 기입합니다.
     * @exception OutOfMemoryError : 해당 Method 수행 시 발생 가능한 OutOfMemoryError에 대한 설명을 기입합니다.
     */
	@RequestMapping(value = "/sample/{path_1}/{path_2}/{path_3}", method= {RequestMethod.GET, RequestMethod.POST})
	public <T> ResponseEntity<T> restControllerTest_1(
			@PathVariable(name="path_1") String path_1,
			@PathVariable(name="path_2") String path_2,
			@PathVariable(name="path_3") String path_3,
			@RequestParam(value="queryString_1") String queryString_1,
			@RequestParam(value="queryString_2") String queryString_2,
			@RequestParam(value="queryString_3") String queryString_3
			) throws NullPointerException, OutOfMemoryError {
		
		T response = (T) "responseBody";
		
		return new ResponseEntity<T>(response, HttpStatus.OK);
	}
	
	/** 
     * Descriptions.First Sentence : 해당 Method에 대한 설명을 기입합니다.
     * 
     * <p>
     * HTML P태그를 이용한 설명 기입_1
     * <p>
     * HTML P태그를 이용한 설명 기입_2
     * <p>
     * HTML P태그를 이용한 설명 기입_3
     *
     * @param path_1 : 해당 메소드의 파라미터 path_1에 대한 설명을 기입합니다.
     * @param path_2 : 해당 메소드의 파라미터 path_2에 대한 설명을 기입합니다.
     * @param path_3 : 해당 메소드의 파라미터 path_3에 대한 설명을 기입합니다.
     * @param queryString_1 : 해당 메소드의 파라미터 queryString_1에 대한 설명을 기입합니다.
     * @param queryString_2 : 해당 메소드의 파라미터 queryString_2에 대한 설명을 기입합니다.
     * @param queryString_3 : 해당 메소드의 파라미터 queryString_3에 대한 설명을 기입합니다.
     * @return          <code>리턴타입_1</code> 해당 Method 수행 성공<br> 
     *                  <code>리턴타입_2</code> 해당 Method 수행 시 예외 발생
     * @since 해당 Method 작성일을 기입합니다.
     * @exception NullPointerException : 해당 Method 수행 시 발생 가능한 NullPointerException에 대한 설명을 기입합니다.
     * @exception OutOfMemoryError : 해당 Method 수행 시 발생 가능한 OutOfMemoryError에 대한 설명을 기입합니다.
     */
	@RequestMapping(value = "/sample/{path_1}/{path_2}/{path_3}", method= {RequestMethod.GET, RequestMethod.POST})
	@HystrixCommand(commandKey = "taskName", 
					fallbackMethod = "fallbackMethodName", 
					commandProperties= {
							@HystrixProperty(name="coreSize", value = "10"),
							@HystrixProperty(name="maxQueueSize", value = "100"),
							@HystrixProperty(name="keepAliveTimeMinutes", value = "2"),
							@HystrixProperty(name="queueSizeRejectionThreshold", value = "15"),
							@HystrixProperty(name="metrics.rollingStats.numBuckets", value = "10"),
							@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "600000")
							}
					)
	public ResponseEntity<String> restControllerTest_2(
			@PathVariable(name="path_1") String path_1, 
			@PathVariable(name="path_2") String path_2,  
			@PathVariable(name="path_3") String path_3,   
			@RequestParam(value="queryString_1") String queryString_1,
			@RequestParam(value="queryString_2") String queryString_2,
			@RequestParam(value="queryString_3") String queryString_3
			) throws NullPointerException, OutOfMemoryError {
		
		String response = "responseBody";
		
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
