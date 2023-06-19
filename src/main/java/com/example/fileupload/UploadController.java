package com.example.fileupload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String index() {
        return "upload";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam ("file") MultipartFile file, @ModelAttribute FormModel formModel) {
        System.out.println(formModel.getName());
        System.out.println(file.getOriginalFilename());
        return "redirect:/";
    }
}
