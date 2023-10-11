package com.example.demo.web.csv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.example.demo.domain.CsvEntity;
import org.springframework.ui.Model;

@Controller
public class CsvController {
  @GetMapping("/csv")
  public String showUploadForm(Model model) {

    var dataList = List.of(
        new CsvEntity(1, "原田", 23, "女"),
        new CsvEntity(2, "山本", 25, "男"));

    model.addAttribute("dataList", dataList);
    
    return "csv/uploadForm";
  }

}
