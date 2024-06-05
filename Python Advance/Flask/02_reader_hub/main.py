from flask import Flask, render_template, request


app = Flask(__name__)

title="Book List"
books = [
    {
        'id': 1,
        'title': 'The Great Gatsby',
        'author': 'F. Scott Fitzgerald',
        'year': 1925,
        'description': 'A novel about the American Dream.',
    },
    {
        'id': 2,
        'title': 'To Kill a Mockingbird',
        'author': 'Harper Lee',
        'year': 1960,
        'description': 'A classic novel addressing racial injustice.',
    },
    {
        'id': 3,
        'title': '1984',
        'author': 'George Orwell',
        'year': 1949,
        'description': 'A dystopian novel about surveillance and totalitarianism.',
    },
]



@app.route('/')
def book_list():
    print("this is inside main route")
    print(request.method)
    return render_template('book_list.html', title = title, books = books)



@app.route('/book/<int:book_id>')
def book_detail(book_id):
    print("This is inside book detail")
    print(request.method)
    book = next((book for book in books if book['id'] == book_id), None)
    if book :
        return render_template('book_detail.html', book = book)
    else:
        return "Book not found", 404


if __name__ == '__main__':
    app.run(debug=True)