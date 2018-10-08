package data_objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "root")
public class RootData {

    private List<LoginData> loginDataList;
    private List<ProductData> productDataList;

    @XmlElement(name = "login_data")
    public List<LoginData> getLoginDataList() {
        return loginDataList;
    }

    @XmlElement(name = "product_data")
    public List<ProductData> getProductDataList() {
        return productDataList;
    }

    public void setProductDataList(List<ProductData> productDataList) {
        this.productDataList = productDataList;
    }

    public void setLoginDataList(List<LoginData> loginDataList) {
        this.loginDataList = loginDataList;
    }
}
