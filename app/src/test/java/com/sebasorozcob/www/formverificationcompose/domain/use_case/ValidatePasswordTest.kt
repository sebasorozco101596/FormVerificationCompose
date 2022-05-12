package com.sebasorozcob.www.formverificationcompose.domain.use_case

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class ValidatePasswordTest {

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp() {
        validatePassword = ValidatePassword()
    }

    @Test
    fun `Password is letter only, returns error`() {
        val result = validatePassword.execute("abcdefghi")

        assertEquals(result.successful, false)
    }

    @Test
    fun `Password is digit only, returns error`() {
        val result = validatePassword.execute("12345678")

        assertEquals(result.successful, false)
    }

    @Test
    fun `Password is less than 8 characters, returns error`() {
        val result = validatePassword.execute("12345a")

        assertEquals(result.successful, false)
    }
}