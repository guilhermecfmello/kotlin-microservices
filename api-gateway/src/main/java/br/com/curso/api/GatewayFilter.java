package br.com.curso.api;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.client.LoadBalancer;
import io.micronaut.http.client.ProxyHttpClient;
import io.micronaut.http.filter.FilterChain;
import io.micronaut.http.filter.OncePerRequestHttpServerFilter;
import io.micronaut.http.filter.ServerFilterChain;
import jakarta.inject.Named;
import org.reactivestreams.Publisher;

import java.util.Map;

@Filter("/**")
public class GatewayFilter extends OncePerRequestHttpServerFilter {

    @Named("serviceLoadBalancers")
    private final Map<String, LoadBalancer> serviceLoadBalancers;
    private final ProxyHttpClient proxyHttpClient;


    public GatewayFilter(Map<String, LoadBalancer> serviceLoadBalancers, ProxyHttpClient proxyHttpClient) {
        this.serviceLoadBalancers = serviceLoadBalancers;
        this.proxyHttpClient = proxyHttpClient;
    }

    @Override
    protected Publisher<MutableHttpResponse<?>> doFilterOnce(HttpRequest<?> request, ServerFilterChain chain) {
        return null;
    }

    @Override
    public Publisher<? extends HttpResponse<?>> doFilter(HttpRequest<?> request, FilterChain chain) {
        return super.doFilter(request, chain);
    }

    @Override
    public int getOrder() {
        return super.getOrder();
    }
}
