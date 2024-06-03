from flask import Flask, render_template


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
    return render_template('book_list.html', title = title, books = books)



if __name__ == '__main__':
    app.run(debug=True)