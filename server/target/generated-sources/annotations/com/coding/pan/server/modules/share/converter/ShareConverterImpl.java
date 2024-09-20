package com.coding.pan.server.modules.share.converter;

import com.coding.pan.server.modules.share.context.CreateShareUrlContext;
import com.coding.pan.server.modules.share.po.CreateShareUrlPO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-20T20:28:05+0100",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class ShareConverterImpl implements ShareConverter {

    @Override
    public CreateShareUrlContext createShareUrlPO2CreateShareUrlContext(CreateShareUrlPO createShareUrlPO) {
        if ( createShareUrlPO == null ) {
            return null;
        }

        CreateShareUrlContext createShareUrlContext = new CreateShareUrlContext();

        createShareUrlContext.setShareDayType( createShareUrlPO.getShareDayType() );
        createShareUrlContext.setShareName( createShareUrlPO.getShareName() );
        createShareUrlContext.setShareType( createShareUrlPO.getShareType() );

        createShareUrlContext.setUserId( com.coding.pan.server.common.utils.UserIdUtil.get() );

        return createShareUrlContext;
    }
}
