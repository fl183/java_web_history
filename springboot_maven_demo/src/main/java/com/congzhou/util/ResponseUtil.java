package com.congzhou.util;

import com.alibaba.fastjson.JSONObject;
import com.congzhou.component.res.Result;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseUtil {

    /**
     * 将result转为json字符串并写入到响应数据
     */
    public static void responseWriteJson(HttpServletResponse httpServletResponse, int httpStatus, Result result) throws IOException {
        httpServletResponse.setContentType("application/json; charset=UTF-8");
        httpServletResponse.setStatus(httpStatus);
        PrintWriter out = httpServletResponse.getWriter();
        out.write(JSONObject.toJSONString(result));
        out.flush();
        out.close();
    }
}
