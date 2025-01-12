<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hopper's Receipt</title>
</head>
<body>
    <h1>Receipt</h1>
    <p><strong>Customer:</strong> ${name}</p>
    <p><strong>Item:</strong> ${itemName}</p>
    <p><strong>Price:</strong> $${price}</p>
    <p><strong>Description:</strong> ${description}</p>
    <p><strong>Vendor:</strong> ${vendor}</p>
</body>
</html>
