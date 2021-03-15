package pl.wiktor.example.domain.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.wiktor.example.api.dto.response.UserView;
import pl.wiktor.example.domain.user.Useres;

@Component
public class UserToUserViewConverter implements Converter<Useres, UserView> {

    @Override
    public UserView convert(Useres user) {
        return new UserView(
                user.getId(),
                user.getLogin()
        );
    }
}
