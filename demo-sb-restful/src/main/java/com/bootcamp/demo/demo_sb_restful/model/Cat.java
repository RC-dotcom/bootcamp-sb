package com.bootcamp.demo.demo_sb_restful.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Cat {
  public static List<Cat> cats = new ArrayList<>();

  private Long id;
  private String name;
  private int age;
}
