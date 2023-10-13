package com.example.restapisample;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

import java.time.LocalDate;

public class StudentUpdate {
    @Getter
    @Pattern(regexp = "^[0-9]{5}$", message = "学生IDは5桁の数字である必要があります")
    public String studentId;

    @NotBlank(message = "名前を入力してください")
    public String name;

    @NotBlank(message = "パートナーポケモンを入力してください")
    public String partnerPokemon;

    @NotNull(message = "誕生日を入力してください")
    public LocalDate birthday;

    public StudentUpdate(String studentId, String name, String partnerPokemon, LocalDate birthday) {
        this.studentId = studentId;
        this.name = name;
        this.partnerPokemon = partnerPokemon;
        this.birthday = birthday;

    }
}
