/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.hazelcast.remotecontroller;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.15.0)", date = "2022-06-17")
public enum Lang implements org.apache.thrift.TEnum {
  JAVASCRIPT(1),
  GROOVY(2),
  PYTHON(3),
  RUBY(4);

  private final int value;

  private Lang(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static Lang findByValue(int value) { 
    switch (value) {
      case 1:
        return JAVASCRIPT;
      case 2:
        return GROOVY;
      case 3:
        return PYTHON;
      case 4:
        return RUBY;
      default:
        return null;
    }
  }
}
