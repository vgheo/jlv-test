
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test1 {
  private static final Logger logger = LoggerFactory.getLogger(Test1.class);
  public static void main(String[] args) throws Exception {
    logger.info("test");
    Thread.sleep(1000);
  }
}