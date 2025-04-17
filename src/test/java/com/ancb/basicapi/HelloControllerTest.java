package com.ancb.basicapi;

import com.ancb.basicapi.controller.HelloController;
import com.ancb.basicapi.util.MessageUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    private HelloController helloController;
    private MessageUtils messageUtils;

    @BeforeEach
    void setUp() {
        // Creamos el mock de MessageUtils
        messageUtils = Mockito.mock(MessageUtils.class);

        // Inyectamos el mock en el controlador
        helloController = new HelloController(messageUtils);
    }

    @Test
    void testHello() {
        // Damos comportamiento al mock
        when(messageUtils.getMessage()).thenReturn("Hello World!");

        // Ejecutamos el método del controlador
        String result = helloController.hello();

        // Verificamos el resultado
        assertEquals("Hello World!", result);

        // Verificamos que se llamó al método del mock
        verify(messageUtils, times(1)).getMessage();
    }

    @Test
    void testBye() {
        // Simulamos comportamiento del mock
        doNothing().when(messageUtils).setMessage("Bye World!");
        when(messageUtils.getMessage()).thenReturn("Bye World!");

        // Ejecutamos el método del controlador
        String result = helloController.byr();

        // Verificamos el resultado
        assertEquals("Bye World!", result);

        // Verificamos interacciones
        verify(messageUtils).setMessage("Bye World!");
        verify(messageUtils).getMessage();
    }

    //This is a comment
}
