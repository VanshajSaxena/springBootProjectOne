package org.example.bean;

public class UserConfig {
  private String name;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the className
   */
  public String getClassName() {
    return className;
  }

  private String className;

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param className the className to set
   */
  public void setClassName(String className) {
    this.className = className;
  }

}
