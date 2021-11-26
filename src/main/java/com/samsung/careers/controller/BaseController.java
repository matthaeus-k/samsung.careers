package com.samsung.careers.controller;

import com.samsung.careers.common.Const;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    public String viewPath(String strPath, HttpServletRequest req) {
        Device device = DeviceUtils.getCurrentDevice(req); //
        String viewPath = Const.VIEW_PATH + strPath;

        return viewPath;
    }
}
