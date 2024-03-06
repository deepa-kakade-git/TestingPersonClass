package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedLastName = "";
        String expectedBirthMonth = "";
        String expectedFavColor = "";



    // When
    Person person = new Person();


        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualLastName = person.getLastName();
        String actualBirthMonth = person.getBirthMonth();
        String actualFavColor = person.getFavColor();


        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedAge,actualAge);
        Assert.assertEquals(expectedLastName,actualLastName);
        Assert.assertEquals(expectedBirthMonth,actualBirthMonth);
        Assert.assertEquals(expectedFavColor,actualFavColor);



    }
    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedLastName = "Doe";
        String expectedBirthMonth = "June";
        String expectedBavColor = "pink";


        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    public void testSetLastName() {
        // Given
        Person person = new Person();
        String expected = "Doe";

        // When
        person.setName(expected);
        String actual = person.getLastName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testSetBirthMonth() {
        // Given
        Person person = new Person();
        String expected = "June";

        // When
        person.setBirthMonth(expected);
        String actual = person.getBirthMonth();

        // Then
        Assert.assertEquals(expected, actual);
    }

    public void testSetFavColor() {
        // Given
        Person person = new Person();
        String expected = "Pink";

        // When
        person.setFavColor(expected);
        String actual = person.getFavColor();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
