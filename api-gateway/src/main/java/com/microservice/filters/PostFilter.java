package com.microservice.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PostFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return "post";
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
      RequestContext ctx = RequestContext.getCurrentContext();
      if (!ctx.getRequest().getRequestURI().equals("hdhhd")){
          throw new RuntimeException();
      }
    return null;
  }
}
