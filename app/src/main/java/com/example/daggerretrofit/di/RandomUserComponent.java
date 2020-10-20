package com.example.daggerretrofit.di;

import com.example.daggerretrofit.apis.UsersApi;
import com.example.daggerretrofit.di.modules.PicassoModule;
import com.example.daggerretrofit.di.modules.RandomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {
    UsersApi getRandomUserService();
    Picasso getPicasso();
}
