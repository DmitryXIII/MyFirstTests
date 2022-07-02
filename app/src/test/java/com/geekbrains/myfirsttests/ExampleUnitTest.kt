package com.geekbrains.myfirsttests

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun emailValidator_invalidEmailNoDomain_False() {
        assertFalse(EmailValidator.isValidEmail("anything@mail"))
    }

    @Test
    fun emailValidator_EmptyInput_False() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_DotsOnly_False() {
        assertFalse(EmailValidator.isValidEmail("..."))
    }

    @Test
    fun emailValidator_TwoAts_False() {
        assertFalse(EmailValidator.isValidEmail("login@@mail.ru"))
    }
}