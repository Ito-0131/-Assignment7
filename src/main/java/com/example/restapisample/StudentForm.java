package com.example.restapisample;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import java.time.LocalDate;

public class StudentForm {
    @Getter
    @Pattern(regexp = "^[0-9]{5}$", message = "学生IDは5桁の数字である必要があります")
    public String studentId;

    @NotBlank(message = "名前を入力してください")
    @Size(min = 1, max = 20, message = "Name must be maximum 20 characters")
    public String name;

    @NotBlank(message = "パートナーポケモンを入力してください")
    public String partnerPokemon;

    @NotNull(message = "誕生日を入力してください")
    public LocalDate birthday;

    public StudentForm(String studentId, String name, String partnerPokemon, LocalDate birthday) {
        this.studentId = studentId;
        this.name = name;
        this.partnerPokemon = partnerPokemon;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday.toString();
    }

    public String getPartnerPokemon() {
        return partnerPokemon;
    }
}