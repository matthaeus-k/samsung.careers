package com.samsung.careers.controller;

import com.samsung.careers.common.Const;
import com.samsung.careers.common.FileUtils;
import com.samsung.careers.dto.FilesDto;
import com.samsung.careers.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class BaseController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ServletContext servletContext;

    @Value("${env.root.path}")
    private String rootPath;

    public String viewPath(String strPath, HttpServletRequest req) {
        Device device = DeviceUtils.getCurrentDevice(req); //
        logger.info("rootPath::{}" + rootPath);
        String viewPath = Const.VIEW_PATH + strPath;
        return viewPath;
    }

    @PostMapping("/file.act")
    @ResponseBody
    public Result fileAct(FilesDto params, HttpServletRequest req) throws IOException {
        String rootPath = System.getProperty("user.dir") ;
        params.setFilePath(rootPath);
        params.setFileDir("bbs"); // 정보구조별 디렉토리 구분
        FileUtils files = new FileUtils();
        return files.fileUPload(params);
    }

}
