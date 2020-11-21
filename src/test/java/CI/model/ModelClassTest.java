package CI.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModelClassTest {
  @Test
  @DisplayName("")
  public void setNameTest() {
    ModelClass m = new ModelClass();
    
    m.setName("name");
    
    assertEquals("name_not", m.getName());
  }
}
