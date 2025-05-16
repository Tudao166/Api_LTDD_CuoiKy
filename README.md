API Backend cho web/ứng dụng về cửa hàng quản lý sách. Có thể thay đổi cấu trúc linh hoạt cho các dạng cửa hàng khác.
Bao gồm các chức năng như: 
+Đăng nhập đăng ký bằng OTP
+Thêm xóa sửa sản phẩm
+Thêm xóa sửa loại sản phẩm
+Thêm xóa sửa giỏ hàng
+Thêm xóa sửa đánh giá


Thêm category:+
+POST: http://localhost:8080/api/v1/categories
{
  "name": "Điện thoại",
  "description": "Tất cả các loại điện thoại di động",
  "imageUrl": "https://example.com/images/smartphone-category.jpg"
}

Lấy tất cả danh mục:
+ GET /api/v1/categories
Lấy danh mục theo ID:
+ GET /api/v1/categories/{id}
Cập nhật danh mục:
+ PUT /api/v1/categories/{id}
Xóa danh mục:
+ DELETE /api/v1/categories/{id}


Thêm product: 
+ POST http://localhost:8080/api/v1/products
{
  "name": "Samsung Galaxy S23 Ultra",
  "description": "Điện thoại flagship mới nhất từ Samsung với camera 108MP, màn hình AMOLED 6.8 inch và bút S-Pen tích hợp",
  "price": 25990000,
  "quantity": 30,
  "imageUrl": "https://example.com/images/samsung-s23-ultra.jpg",
  "categoryId": 1
}
Lọc sản phẩm theo danh mục (ID):
+ GET /api/v1/products/category/{categoryId}
Lấy tất cả sản phẩm:
+ GET /api/v1/products
Lấy sản phẩm theo ID:
+ GET /api/v1/products/{id}
Cập nhật sản phẩm:
+ PUT /api/v1/products/{id}
Body: JSON của ProductDTO
Xóa sản phẩm:
+ DELETE /api/v1/products/{id}
Tìm kiếm sản phẩm theo tên:
+ GET /api/v1/products/search?name={searchTerm}
+ Ví dụ: http://localhost:8080/api/v1/products/search?name=Samsung

Lấy danh sách sản phẩm có trong giỏ hàng của ai đó:
+ Get Cart: GET /carts/{userId}
+ GET http://localhost:8080/api/v1/carts/a33540f2-eea9-4eb2-b0a4-4cba914420c3
Add Item to Cart:
+ POST /carts/{userId}/items
Thêm vật phẩm vào giỏ hàng với body như sau
{
  "productId": 3,
  "quantity": 2
}

Update Cart Item: 
+ PUT /carts/{userId}/items
+Thay đổi số lượng sản phẩm trong cart
	{
  "productId": 3,
  "quantity": 3
}

Xóa sản phẩm khỏi cart:
+Remove Item from Cart: DELETE /carts/{userId}/items/{productId}
Xóa toàn bộ sản phẩm:
+Clear Cart: DELETE /carts/{userId}


