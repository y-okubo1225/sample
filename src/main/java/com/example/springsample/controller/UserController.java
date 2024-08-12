package com.example.springsample.controller;


//各ライブラリやパッケージから必要なクラスとインターフェースをインポートしている
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springsample.entity.User;
import com.example.springsample.service.UserService;

/**
 * ユーザー情報 Controller
 * ユーザー情報に関連するリクエストを処理するコントローラークラスです
 */
@Controller
public class UserController {

  /**
   * ユーザー情報 Service
   */
  //UserServiceクラスをインスタンス化してメソッドを使用できるようにする記述。userServiceという変数に格納して下のコードで使用している
  @Autowired
  UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
   */
  ///user/listがリクエスト(GET)された際に動くメソッド。処理をしてHTMLファイルを返している
  @RequestMapping(value = "/user/list", method = RequestMethod.GET)
  public String displayList(Model model) {
    List<User> userlist = userService.searchAll();
    model.addAttribute("userlist", userlist);
    return "list.html";
  }
}