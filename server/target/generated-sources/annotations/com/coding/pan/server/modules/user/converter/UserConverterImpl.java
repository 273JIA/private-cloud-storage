package com.coding.pan.server.modules.user.converter;

import com.coding.pan.server.modules.file.entity.RPanUserFile;
import com.coding.pan.server.modules.user.context.ChangePasswordContext;
import com.coding.pan.server.modules.user.context.CheckAnswerContext;
import com.coding.pan.server.modules.user.context.CheckUsernameContext;
import com.coding.pan.server.modules.user.context.ResetPasswordContext;
import com.coding.pan.server.modules.user.context.UserLoginContext;
import com.coding.pan.server.modules.user.context.UserRegisterContext;
import com.coding.pan.server.modules.user.entity.RPanUser;
import com.coding.pan.server.modules.user.po.ChangePasswordPO;
import com.coding.pan.server.modules.user.po.CheckAnswerPO;
import com.coding.pan.server.modules.user.po.CheckUsernamePO;
import com.coding.pan.server.modules.user.po.ResetPasswordPO;
import com.coding.pan.server.modules.user.po.UserLoginPO;
import com.coding.pan.server.modules.user.po.UserRegisterPO;
import com.coding.pan.server.modules.user.vo.UserInfoVO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-20T20:28:05+0100",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class UserConverterImpl implements UserConverter {

    @Override
    public UserRegisterContext userRegisterPO2UserRegisterContext(UserRegisterPO userRegisterPO) {
        if ( userRegisterPO == null ) {
            return null;
        }

        UserRegisterContext userRegisterContext = new UserRegisterContext();

        userRegisterContext.setAnswer( userRegisterPO.getAnswer() );
        userRegisterContext.setPassword( userRegisterPO.getPassword() );
        userRegisterContext.setQuestion( userRegisterPO.getQuestion() );
        userRegisterContext.setUsername( userRegisterPO.getUsername() );

        return userRegisterContext;
    }

    @Override
    public RPanUser userRegisterContext2RPanUser(UserRegisterContext userRegisterContext) {
        if ( userRegisterContext == null ) {
            return null;
        }

        RPanUser rPanUser = new RPanUser();

        rPanUser.setAnswer( userRegisterContext.getAnswer() );
        rPanUser.setQuestion( userRegisterContext.getQuestion() );
        rPanUser.setUsername( userRegisterContext.getUsername() );

        return rPanUser;
    }

    @Override
    public UserLoginContext userLoginPO2UserLoginContext(UserLoginPO userLoginPO) {
        if ( userLoginPO == null ) {
            return null;
        }

        UserLoginContext userLoginContext = new UserLoginContext();

        userLoginContext.setPassword( userLoginPO.getPassword() );
        userLoginContext.setUsername( userLoginPO.getUsername() );

        return userLoginContext;
    }

    @Override
    public CheckUsernameContext checkUsernamePO2CheckUsernameContext(CheckUsernamePO checkUsernamePO) {
        if ( checkUsernamePO == null ) {
            return null;
        }

        CheckUsernameContext checkUsernameContext = new CheckUsernameContext();

        checkUsernameContext.setUsername( checkUsernamePO.getUsername() );

        return checkUsernameContext;
    }

    @Override
    public CheckAnswerContext checkAnswerPO2CheckAnswerContext(CheckAnswerPO checkAnswerPO) {
        if ( checkAnswerPO == null ) {
            return null;
        }

        CheckAnswerContext checkAnswerContext = new CheckAnswerContext();

        checkAnswerContext.setAnswer( checkAnswerPO.getAnswer() );
        checkAnswerContext.setQuestion( checkAnswerPO.getQuestion() );
        checkAnswerContext.setUsername( checkAnswerPO.getUsername() );

        return checkAnswerContext;
    }

    @Override
    public ResetPasswordContext resetPasswordPO2ResetPasswordContext(ResetPasswordPO resetPasswordPO) {
        if ( resetPasswordPO == null ) {
            return null;
        }

        ResetPasswordContext resetPasswordContext = new ResetPasswordContext();

        resetPasswordContext.setPassword( resetPasswordPO.getPassword() );
        resetPasswordContext.setToken( resetPasswordPO.getToken() );
        resetPasswordContext.setUsername( resetPasswordPO.getUsername() );

        return resetPasswordContext;
    }

    @Override
    public ChangePasswordContext changePasswordPO2ChangePasswordContext(ChangePasswordPO changePasswordPO) {
        if ( changePasswordPO == null ) {
            return null;
        }

        ChangePasswordContext changePasswordContext = new ChangePasswordContext();

        changePasswordContext.setNewPassword( changePasswordPO.getNewPassword() );
        changePasswordContext.setOldPassword( changePasswordPO.getOldPassword() );

        return changePasswordContext;
    }

    @Override
    public UserInfoVO assembleUserInfoVO(RPanUser rPanUser, RPanUserFile rPanUserFile) {
        if ( rPanUser == null && rPanUserFile == null ) {
            return null;
        }

        UserInfoVO userInfoVO = new UserInfoVO();

        if ( rPanUser != null ) {
            userInfoVO.setUsername( rPanUser.getUsername() );
        }
        if ( rPanUserFile != null ) {
            userInfoVO.setRootFileId( rPanUserFile.getFileId() );
            userInfoVO.setRootFilename( rPanUserFile.getFilename() );
        }

        return userInfoVO;
    }
}
