package cn.itcast.wanxinp2p.account.controller;

import cn.itcast.wanxinp2p.account.service.AccountService;
import cn.itcast.wanxinp2p.api.AccountAPI;
import cn.itcast.wanxinp2p.api.account.model.AccountDTO;
import cn.itcast.wanxinp2p.api.account.model.AccountLoginDTO;
import cn.itcast.wanxinp2p.api.account.model.AccountRegisterDTO;
import cn.itcast.wanxinp2p.common.domain.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "统一账户服务" ,tags = "Account",description = "统一账号服务API")
@RestController
public class AccountController implements AccountAPI {

    @Autowired
    private AccountService accountService;
    @ApiOperation("获取手机验证码")
    @ApiImplicitParam(name = "mobile",value = "手机号",dataType = "String")
    @GetMapping("/sms/{mobile}")
    public RestResponse getSMSCode(@PathVariable String mobile) {
        return accountService.getSMSCode(mobile);
    }

    @Override
    public RestResponse<Integer> checkMobile(String mobile, String key, String code) {
        return null;
    }

    @Override
    public RestResponse<AccountDTO> register(AccountRegisterDTO accountRegisterDTO) {
        return null;
    }

    @Override
    public RestResponse<AccountDTO> login(AccountLoginDTO accountLoginDTO) {
        return null;
    }
}
