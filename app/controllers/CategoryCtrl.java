package controllers;

import models.Category;
import org.myweb.db.Dao;
import org.myweb.services.ServiceException;
import org.myweb.services.crud.*;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class CategoryCtrl extends Controller {

    @Transactional(readOnly = true)
    public static Result get(Long id){

        return GetService.getInstance(Dao.getInstance())
                .get( Category.class, id )
                .buildPlayCtrlResult();

    }

    @Transactional(readOnly = true)
    public static Result query(){

        return QueryService.getInstance(Dao.getInstance())
                .query(Category.class)
                .buildPlayCtrlResult();

    }

    @Transactional(readOnly = false)
    public static Result update(Long id){

        return UpdateService.getInstance(Dao.getInstance())
                .update( Category.class, request().body().asJson(), id )
                .buildPlayCtrlResult();

    }

    @Transactional(readOnly = false)
    public static Result create(){

        return CreateService.getInstance(Dao.getInstance())
                .create( Category.class, request().body().asJson() )
                .buildPlayCtrlResult();


    }

    @Transactional(readOnly = false)
    public static Result delete(Long id){

        return DeleteService.getInstance(Dao.getInstance())
                .delete( Category.class, id )
                .buildPlayCtrlResult();

    }
}