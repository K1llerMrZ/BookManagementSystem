package com.etoak.java.feign;

import com.etoak.java.vo.ResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(value = "bm-book-service")
public interface IBookServiceFeign {
    @RequestMapping("/book/getStatusByNo")
    ResultVO getBookStatusByNo(String no);

    @RequestMapping("/book/updateBookStateByNo")
    ResultVO updateBookStateByNo(String no, Integer i);
}
