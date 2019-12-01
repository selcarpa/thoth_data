package cn.aethli.thoth.controller;

import cn.aethli.thoth.common.enums.LotteryType;
import cn.aethli.thoth.service.LotteryService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @device: Hades
 * @author: Termite
 * @date: 2019-08-26 14:58
 */
@RestControllerAdvice
@RequestMapping("lottery")
public class LotteryCtrl {

  @Autowired private LotteryService lotteryService;

  @GetMapping
  public Object doGet(@RequestBody Map<String, String> params) {
    LotteryType type = LotteryType.get(Integer.parseInt(params.get("type")));
    lotteryService.getNewest(type);
    switch (type) {
      case QXC:
        break;
    }
    return null;
  }
}
