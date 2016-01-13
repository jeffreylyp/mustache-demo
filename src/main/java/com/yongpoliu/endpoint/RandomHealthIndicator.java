package com.yongpoliu.endpoint;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomHealthIndicator extends AbstractHealthIndicator {

  private Random random = new Random(10);

  @Override
  protected void doHealthCheck(Health.Builder builder) throws Exception {
    int i = random.nextInt();
    builder.withDetail("random", i);
    if (i % 2 == 0) {
      builder.up();
    } else {
      builder.down();
    }
  }
}
