package org.myweb.utils.test;

import models.*;
import models.user.User;
import models.user.UserPasswordSettings;
import org.jetbrains.annotations.NotNull;
import org.myweb.services.user.login.UserLoginAttempt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
public class TestHelper {

    public static UserLoginAttempt userLoginAttemptFactory(String email, String login, String pwd) {
        UserLoginAttempt ula = new UserLoginAttempt();
        ula.setEmail(email);
        ula.setLogin(login);
        ula.setPassword(pwd);
        return ula;
    }

    public static UserPasswordSettings userPasswordSettingsFactory(
            byte[] hashedPwd, int iterations, int pwdDerivatedKeyBitLength, String pwdPBKDF2algo, byte[] salt,
            int saltByteLength
    ) {
        UserPasswordSettings ups = new UserPasswordSettings();
        ups.setHashedPwd(hashedPwd);
        ups.setIterations(iterations);
        ups.setPwdDerivatedKeyBitLength(pwdDerivatedKeyBitLength);
        ups.setPwdPBKDF2algo(pwdPBKDF2algo);
        ups.setSalt(salt);
        ups.setSaltByteLength(saltByteLength);
        return ups;
    }

    @NotNull
    public static User userFactory(
            Long id, String login, String newPassword, String confirmPassword, String email
    ) {
        User user = new User();
        user.setId(id);
        user.setLogin(login);
        user.setNewPassword(newPassword);
        user.setConfirmPassword(confirmPassword);
        user.setEmail(email);
        return user;
    }

    @NotNull
    public static User userFactory(
            Long id, String login, String newPassword, String confirmPassword, String email, UserPasswordSettings ups
    ) {
        User user = new User();
        user.setId(id);
        user.setLogin(login);
        user.setNewPassword(newPassword);
        user.setConfirmPassword(confirmPassword);
        user.setEmail(email);
        user.setUserPasswordSettings(ups);
        return user;
    }

    @NotNull
    public static Category categoryFactory(Long id, String name) {
        Category category = new Category();
        category.setId(id);
        category.setName(name);
        return category;
    }

    @NotNull
    public static List<Category> categoryListFactory(Category... categories) {
        List<Category> res = new ArrayList<>();
        Collections.addAll(res, categories);
        return res;
    }

    @NotNull
    public static Product productFactory(Long id, String name, Date date, Integer integer, Long _long, Category category){
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setDate(date);
        product.setNumberInteger(integer);
        product.setNumberLong(_long);
        product.setCategory(category);
        return product;
    }

    @NotNull
    public static List<Product> productListFactory(Product... products) {
        List<Product> res = new ArrayList<>();
        Collections.addAll(res, products);
        return res;
    }

    @NotNull
    public static County countyFactory(Long id, String code, String name) {
        County county = new County();
        county.setId(id);
        county.setCode(code);
        county.setName(name);
        return county;
    }

    @NotNull
    public static List<County> countyListFactory(County... counties) {
        List<County> res = new ArrayList<>();
        Collections.addAll(res, counties);
        return res;
    }

    @NotNull
    public static Cinema cinemaFactory(Long id, String name, Integer screen, Integer seat, County county) {
        Cinema cinema = new Cinema();
        cinema.setId(id);
        cinema.setName(name);
        cinema.setScreen(screen);
        cinema.setSeat(seat);
        cinema.setCounty(county);

        return cinema;
    }

    @NotNull
    public static List<Cinema> cinemaListFactory(Cinema... cinemas) {
        List<Cinema> res = new ArrayList<>();
        Collections.addAll(res, cinemas);
        return res;
    }
}
