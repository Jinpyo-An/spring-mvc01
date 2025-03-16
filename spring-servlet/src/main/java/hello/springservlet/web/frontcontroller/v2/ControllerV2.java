package hello.springservlet.web.frontcontroller.v2;

import hello.springservlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV2 {

MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
