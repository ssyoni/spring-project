package noums.study.pizzahouse.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import noums.study.pizzahouse.enums.FoodMenu;
import noums.study.pizzahouse.bean.RereadableRequestWrapper;
import org.apache.commons.lang3.EnumUtils;
import org.json.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderInterceptor implements HandlerInterceptor {

    ObjectMapper objectMapper = new ObjectMapper();

    // 요청을 처리할 Handler 에 가기전에 호출
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(">>>>>>> preHandler ");

        if (request.getClass().getName().contains("SecurityContextHolderAwareRequestWrapper")) return false;

        final RereadableRequestWrapper rereadableRequestWrapper = (RereadableRequestWrapper) request;

        if (rereadableRequestWrapper.getContentType() != null && rereadableRequestWrapper.getContentType().contains("application/json")){
          if(rereadableRequestWrapper.getRawData() != null && rereadableRequestWrapper.getRawData().length != 0){
            String data = rereadableRequestWrapper.getData();
            JSONObject mapper = new JSONObject(data);
            if (!EnumUtils.isValidEnum(FoodMenu.class, mapper.getString("menu"))){
                System.out.println(">>>>> 판매중인 메뉴가 아닙니다. ");
                return false;
            }
          }
        }
        return true;
    }
}
