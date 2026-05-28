package org.kashish.questionservice.Model;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Responses {
    private String questionId;
    private String selectedOption;
}
