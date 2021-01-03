package com.lti.repository;

import java.util.List;

import com.lti.entity.FrequentlyAskedQuestion;
import com.lti.entity.Product;
import com.lti.entity.User;

public interface UserRepository {
    long register(User user);
    User payJoiningFee(int userId);
    boolean login(String userName,String password);
    List<Product> viewAllProducts();
//    Transaction buyProduct(int userId,int productId,String emiScheme);
//    payEmi(int productPurchasedId,int userId,int cardId);
//    Transaction viewTransactionsOfAnUser(int userId);
//    forgotPassword(String email)
    User changePassword(int userId);
    List<FrequentlyAskedQuestion> viewFrequentlyAskedQuestions(int productId);
}
