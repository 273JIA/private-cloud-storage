package com.coding.pan.server.modules.share.converter;

import com.coding.pan.server.modules.share.context.CreateShareUrlContext;
import com.coding.pan.server.modules.share.po.CreateShareUrlPO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-26T20:24:19+0100",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 1.8.0_333 (Oracle Corporation)"
)
@Component
public class ShareConverterImpl implements ShareConverter {

    @Override
    public CreateShareUrlContext createShareUrlPO2CreateShareUrlContext(CreateShareUrlPO createShareUrlPO) {
        if ( createShareUrlPO == null ) {
            return null;
        }

        CreateShareUrlContext createShareUrlContext = new CreateShareUrlContext();

        createShareUrlContext.setShareName( createShareUrlPO.getShareName() );
        createShareUrlContext.setShareType( createShareUrlPO.getShareType() );
        createShareUrlContext.setShareDayType( createShareUrlPO.getShareDayType() );

        createShareUrlContext.setUserId( com.coding.pan.server.common.utils.UserIdUtil.get() );

        return createShareUrlContext;
    }
}
