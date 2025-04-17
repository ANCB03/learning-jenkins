package com.ancb.basicapi.util;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class MessageUtils {
    private String message = "Hello World!, I'm Basic Api!";
}
