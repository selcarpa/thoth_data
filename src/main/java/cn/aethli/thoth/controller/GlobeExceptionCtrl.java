package cn.aethli.thoth.controller;

import cn.aethli.thoth.model.ResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @device: Hades
 * @author: Termite
 * @date: 2019-08-26 11:43
 **/
@Slf4j
@RestControllerAdvice
public class GlobeExceptionCtrl {

  /**
   * 全局所有controller默认异常处理
   *
   * @param e
   * @return
   */
  @ExceptionHandler(value = Exception.class)
  public Object exceptionCatch(Exception e) {
    log.error(e.toString());
    e.printStackTrace();
    return new ResponseModel(ResponseModel.STATUS_ERROR, e.getMessage());
  }
}