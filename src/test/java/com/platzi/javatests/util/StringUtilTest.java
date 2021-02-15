package com.platzi.javatests.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }

    @Test
    public void empty_when_string_is_only_quotes(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void empty_when_string_is_only_spaces(){
        assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void empty_when_string_is_null(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void not_empty_when_string_has_content(){
        assertFalse(StringUtil.isEmpty("Pan con queso"));
    }
}