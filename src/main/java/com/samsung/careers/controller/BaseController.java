package com.samsung.careers.controller;

import com.samsung.careers.common.Const;
import com.samsung.careers.common.FileUtils;
import com.samsung.careers.dto.FilesDto;
import com.samsung.careers.dto.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseController {

    @Autowired
    ServletContext servletContext;

    public String viewPath(String strPath, HttpServletRequest req) {
        Device device = DeviceUtils.getCurrentDevice(req); //
        String viewPath = Const.VIEW_PATH + strPath;

        return viewPath;
    }

    @PostMapping("/file.act")
    @ResponseBody
    public Result fileAct(FilesDto params, HttpServletRequest req) throws IOException {
        //servletcontext 사용
        System.out.println(req.getSession().getServletContext().getRealPath("/"));
        String strfilePath = "/Users/matthaeuskwon/dev/workspace.java/samsung.careers/upload/temp" ;//req.getSession().getServletContext().getRealPath("/upload/temp"); //servletContext.getRealPath("/upload/temp") + File.separator;
        params.setFilePath(strfilePath);
        params.setProfiles("local");
        params.setFileDir("bbs");
        FileUtils files = new FileUtils();
        return files.fileUPload(params);
    }
}
