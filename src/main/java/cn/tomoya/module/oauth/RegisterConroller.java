package cn.tomoya.module.oauth;

import cn.tomoya.common.BaseController;
import cn.tomoya.utils.StrUtil;
import cn.tomoya.utils.ext.route.ControllerBind;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.jfinal.kit.LogKit;
import com.jfinal.kit.PropKit;

import java.io.UnsupportedEncodingException;

/**
 * Created by zhoqj on 2016-06-01.
 */
@ControllerBind(controllerKey = "/reg", viewPath = "WEB-INF/page")
public class RegisterConroller extends BaseController{

    public void redRegisterpage(){

        render("user/register.ftl");
    }


}
